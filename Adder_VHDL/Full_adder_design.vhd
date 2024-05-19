----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    19:13:47 05/09/2024 
-- Design Name: 
-- Module Name:    Full_adder_design - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
-- Dependencies: 
--
-- Revision: 
-- Revision 0.01 - File Created
-- Additional Comments: 
--
----------------------------------------------------------------------------------
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.STD_LOGIC_ARITH.ALL;
use IEEE.STD_LOGIC_UNSIGNED.ALL;

---- Uncomment the following library declaration if instantiating
---- any Xilinx primitives in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity Full_adder_design is
    Port (  x : in  STD_LOGIC;
           y : in  STD_LOGIC;
           c_in : in  STD_LOGIC;
           c_out : out  STD_LOGIC;
           s : out  STD_LOGIC);
end Full_adder_design;

architecture Behavioral of Full_adder_design is

begin
c_out <= (x and y) or (x and c_in) or (y and c_in);
s <= x xor y xor c_in;

end Behavioral;

